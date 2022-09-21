package typings.steamcommunity.mod

import typings.steamcommunity.anon.Foil
import typings.steamcommunity.anon.GemValue
import typings.steamcommunity.anon.GemsReceived
import typings.steamcommunity.anon.GiftName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("steamcommunity", JSImport.Namespace)
@js.native
open class ^ () extends SteamCommunity {
  def this(options: Options) = this()
  
  /**
    * @deprecated No support for new Steam chat. Use steam-user instead.
    */
  /* CompleteClass */
  override def chatLogoff(): Unit = js.native
  
  /**
    * @deprecated No support for new Steam chat. Use steam-user instead.
    *
    * @param interval
    * @param uiMode
    */
  /* CompleteClass */
  override def chatLogon(interval: Double, uiMode: String): Unit = js.native
  
  /**
    * @deprecated No support for new Steam chat. Use steam-user instead.
    * @param recipient
    * @param text
    * @param [type]
    * @param [callback]
    */
  /* CompleteClass */
  override def chatMessage(recipient: userid, text: String, `type`: String, callback: Callback): Unit = js.native
  
  /* CompleteClass */
  override def decodeSteamTime(time: String): js.Date = js.native
  
  /**
    * Get an Error object for a particular EResult
    * @param eresult
    * @returns null|Error
    */
  /* CompleteClass */
  override def eresultError(eresult: EResult): Null | js.Error = js.native
  
  /**
    * Check if an item is eligible to be turned into gems and if so, get its gem value.
    * Note that the AppID you need to provide is the AppID of the game to which the item belongs, not 753 (which is the AppID to which Steam Community items actually belong).
    *
    * @param appid
    * @param assetid
    * @param callback
    */
  /* CompleteClass */
  override def getGemValue(
    appid: appid,
    assetid: assetid,
    callback: js.Function2[/* err */ CallbackError, /* res */ GemValue, Any]
  ): Unit = js.native
  
  /**
    * Get details about a gift in your Steam Gifts inventory.
    *
    * @param giftID A string containing the assetid of the gift in your inventory.
    * @param callback A function to be called when the requested data is available
    */
  /* CompleteClass */
  override def getGiftDetails(giftID: String, callback: js.Function2[/* err */ CallbackError, /* res */ GiftName, Any]): Unit = js.native
  
  /**
    * @deprecated Use GetTradeHistory instead: https://lab.xpaw.me/steam_api_documentation.html#IEconService_GetTradeHistory_v1
    * @param options
    * @param callback
    */
  /* CompleteClass */
  override def getInventoryHistory(options: js.Object, callback: Callback): Unit = js.native
  
  /**
    * Requests a list of all apps which support the Steam Community Market (this list is scraped from the app buttons on the right side of the market home page).
    *
    * @param callback Called when the requested data is available.
    */
  /* CompleteClass */
  override def getMarketApps(callback: js.Function2[/* err */ CallbackError, /* apps */ js.Object, Any]): Unit = js.native
  
  /**
    * Retrieves your account's Web API key, and registers one if needed. Usage of this method constitutes agreement to the Steam Web API terms of use.
    *
    * @param domain A domain name to associate with your key.
    * @param callback A function to be called once the key is obtained.
    */
  /* CompleteClass */
  override def getWebApiKey(domain: String, callback: js.Function2[/* err */ CallbackError, /* key */ String, Any]): Any = js.native
  
  /**
    * Gets an oauth access token for those WebAPI methods that need one.
    * This only works if you logged in via node-steamcommunity and you didn't disable mobile login. Thus, you should just use the token returned in the callback to login.
    *
    * @deprecated No longer works if not logged in via mobile login. Will be removed in a future release.
    * @param callback A function to be called once the token is obtained.
    */
  /* CompleteClass */
  override def getWebApiOauthToken(callback: Callback): Any = js.native
  
  /* CompleteClass */
  override def isSteamID(input: Any): Boolean = js.native
  
  /**
    * Unpacks a booster pack in your inventory.
    *
    * @param appid The AppID of the game to which the booster pack in question belongs.
    * @param assetid The AssetID of the booster pack in question.
    * @param callback A function to be called when the request completes.
    */
  /* CompleteClass */
  override def openBoosterPack(
    appid: appid,
    assetid: assetid,
    callback: js.Function2[/* err */ CallbackError, /* items */ js.Array[Foil], Any]
  ): Unit = js.native
  
  /**
    * Packs some gems into sacks. If you have multiple gem stacks in your inventory, this can only be used to pack one stack at a time.
    * If you have multiple sack stacks in your inventory, there is no way to specify which stack the newly-acquired stacks should be added to.
    *
    * @param assetid - ID of gem stack you want to pack into sacks
    * @param desiredSackCount - How many sacks you want. You must have at least this amount * 1000 gems in the stack you're packing
    * @param callback A function to be called when the request completes.
    */
  /* CompleteClass */
  override def packGemSacks(assetid: assetid, desiredSackCount: Double, callback: Callback): Unit = js.native
  
  /**
    * Redeem a gift in your Steam Gifts inventory and add it to your library.
    *
    * @param giftID A string containing the assetid of the gift in your inventory.
    * @param callback A function to be called when the request completes.
    */
  /* CompleteClass */
  override def redeemGift(giftID: String, callback: Callback): Unit = js.native
  
  /**
    * Removes a license from your account. The help site claims this is "permanent", but it can be undone via a call to restorePackage.
    * @param packageID
    * @param callback
    */
  /* CompleteClass */
  override def removePackage(packageID: packageid, callback: Callback): Unit = js.native
  
  /**
    * Restore a previously removed steam package from your steam account.
    * @param packageID
    * @param callback
    */
  /* CompleteClass */
  override def restorePackage(packageID: packageid, callback: Callback): Unit = js.native
  
  /**
    * Turn an eligible item into gems.
    * @param appid
    * @param assetid
    * @param expectedGemsValue
    * @param callback
    */
  /* CompleteClass */
  override def turnItemIntoGems(
    appid: appid,
    assetid: assetid,
    expectedGemsValue: Double,
    callback: js.Function2[/* err */ CallbackError, /* res */ GemsReceived, Any]
  ): Unit = js.native
  
  /**
    * Unpacks some sacks of gems. You will receive 1000 gems for eaach sack you unpack.
    * If you have multiple gem stacks in your inventory, there is no way to specify which stack newly-acquired gems should be added to.
    * @param assetid - ID of sack stack you want to unpack (say that 5 times fast).
    * @param sacksToUnpack How many sacks in the stack you want to unpack.
    * @param callback A function to be called when the request completes.
    */
  /* CompleteClass */
  override def unpackGemSacks(assetid: assetid, sacksToUnpack: Double, callback: Callback): Unit = js.native
}
