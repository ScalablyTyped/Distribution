package typings.steamcommunity

import typings.steamcommunity.anon.Foil
import typings.steamcommunity.anon.GemValue
import typings.steamcommunity.anon.GemsReceived
import typings.steamcommunity.anon.GiftName
import typings.steamcommunity.mod.Callback
import typings.steamcommunity.mod.CallbackError
import typings.steamcommunity.mod.appid
import typings.steamcommunity.mod.assetid
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object componentsMarketMod {
  
  trait Market extends StObject {
    
    /**
      * Check if an item is eligible to be turned into gems and if so, get its gem value.
      * Note that the AppID you need to provide is the AppID of the game to which the item belongs, not 753 (which is the AppID to which Steam Community items actually belong).
      *
      * @param appid
      * @param assetid
      * @param callback
      */
    def getGemValue(
      appid: appid,
      assetid: assetid,
      callback: js.Function2[/* err */ CallbackError, /* res */ GemValue, Any]
    ): Unit
    
    /**
      * Get details about a gift in your Steam Gifts inventory.
      *
      * @param giftID A string containing the assetid of the gift in your inventory.
      * @param callback A function to be called when the requested data is available
      */
    def getGiftDetails(giftID: String, callback: js.Function2[/* err */ CallbackError, /* res */ GiftName, Any]): Unit
    
    /**
      * Requests a list of all apps which support the Steam Community Market (this list is scraped from the app buttons on the right side of the market home page).
      *
      * @param callback Called when the requested data is available.
      */
    def getMarketApps(callback: js.Function2[/* err */ CallbackError, /* apps */ js.Object, Any]): Unit
    
    /**
      * Unpacks a booster pack in your inventory.
      *
      * @param appid The AppID of the game to which the booster pack in question belongs.
      * @param assetid The AssetID of the booster pack in question.
      * @param callback A function to be called when the request completes.
      */
    def openBoosterPack(
      appid: appid,
      assetid: assetid,
      callback: js.Function2[/* err */ CallbackError, /* items */ js.Array[Foil], Any]
    ): Unit
    
    /**
      * Packs some gems into sacks. If you have multiple gem stacks in your inventory, this can only be used to pack one stack at a time.
      * If you have multiple sack stacks in your inventory, there is no way to specify which stack the newly-acquired stacks should be added to.
      *
      * @param assetid - ID of gem stack you want to pack into sacks
      * @param desiredSackCount - How many sacks you want. You must have at least this amount * 1000 gems in the stack you're packing
      * @param callback A function to be called when the request completes.
      */
    def packGemSacks(assetid: assetid, desiredSackCount: Double, callback: Callback): Unit
    
    /**
      * Redeem a gift in your Steam Gifts inventory and add it to your library.
      *
      * @param giftID A string containing the assetid of the gift in your inventory.
      * @param callback A function to be called when the request completes.
      */
    def redeemGift(giftID: String, callback: Callback): Unit
    
    /**
      * Turn an eligible item into gems.
      * @param appid
      * @param assetid
      * @param expectedGemsValue
      * @param callback
      */
    def turnItemIntoGems(
      appid: appid,
      assetid: assetid,
      expectedGemsValue: Double,
      callback: js.Function2[/* err */ CallbackError, /* res */ GemsReceived, Any]
    ): Unit
    
    /**
      * Unpacks some sacks of gems. You will receive 1000 gems for eaach sack you unpack.
      * If you have multiple gem stacks in your inventory, there is no way to specify which stack newly-acquired gems should be added to.
      * @param assetid - ID of sack stack you want to unpack (say that 5 times fast).
      * @param sacksToUnpack How many sacks in the stack you want to unpack.
      * @param callback A function to be called when the request completes.
      */
    def unpackGemSacks(assetid: assetid, sacksToUnpack: Double, callback: Callback): Unit
  }
  object Market {
    
    inline def apply(
      getGemValue: (appid, assetid, js.Function2[/* err */ CallbackError, /* res */ GemValue, Any]) => Unit,
      getGiftDetails: (String, js.Function2[/* err */ CallbackError, /* res */ GiftName, Any]) => Unit,
      getMarketApps: js.Function2[/* err */ CallbackError, /* apps */ js.Object, Any] => Unit,
      openBoosterPack: (appid, assetid, js.Function2[/* err */ CallbackError, /* items */ js.Array[Foil], Any]) => Unit,
      packGemSacks: (assetid, Double, Callback) => Unit,
      redeemGift: (String, Callback) => Unit,
      turnItemIntoGems: (appid, assetid, Double, js.Function2[/* err */ CallbackError, /* res */ GemsReceived, Any]) => Unit,
      unpackGemSacks: (assetid, Double, Callback) => Unit
    ): Market = {
      val __obj = js.Dynamic.literal(getGemValue = js.Any.fromFunction3(getGemValue), getGiftDetails = js.Any.fromFunction2(getGiftDetails), getMarketApps = js.Any.fromFunction1(getMarketApps), openBoosterPack = js.Any.fromFunction3(openBoosterPack), packGemSacks = js.Any.fromFunction3(packGemSacks), redeemGift = js.Any.fromFunction2(redeemGift), turnItemIntoGems = js.Any.fromFunction4(turnItemIntoGems), unpackGemSacks = js.Any.fromFunction3(unpackGemSacks))
      __obj.asInstanceOf[Market]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Market] (val x: Self) extends AnyVal {
      
      inline def setGetGemValue(value: (appid, assetid, js.Function2[/* err */ CallbackError, /* res */ GemValue, Any]) => Unit): Self = StObject.set(x, "getGemValue", js.Any.fromFunction3(value))
      
      inline def setGetGiftDetails(value: (String, js.Function2[/* err */ CallbackError, /* res */ GiftName, Any]) => Unit): Self = StObject.set(x, "getGiftDetails", js.Any.fromFunction2(value))
      
      inline def setGetMarketApps(value: js.Function2[/* err */ CallbackError, /* apps */ js.Object, Any] => Unit): Self = StObject.set(x, "getMarketApps", js.Any.fromFunction1(value))
      
      inline def setOpenBoosterPack(
        value: (appid, assetid, js.Function2[/* err */ CallbackError, /* items */ js.Array[Foil], Any]) => Unit
      ): Self = StObject.set(x, "openBoosterPack", js.Any.fromFunction3(value))
      
      inline def setPackGemSacks(value: (assetid, Double, Callback) => Unit): Self = StObject.set(x, "packGemSacks", js.Any.fromFunction3(value))
      
      inline def setRedeemGift(value: (String, Callback) => Unit): Self = StObject.set(x, "redeemGift", js.Any.fromFunction2(value))
      
      inline def setTurnItemIntoGems(
        value: (appid, assetid, Double, js.Function2[/* err */ CallbackError, /* res */ GemsReceived, Any]) => Unit
      ): Self = StObject.set(x, "turnItemIntoGems", js.Any.fromFunction4(value))
      
      inline def setUnpackGemSacks(value: (assetid, Double, Callback) => Unit): Self = StObject.set(x, "unpackGemSacks", js.Any.fromFunction3(value))
    }
  }
}
