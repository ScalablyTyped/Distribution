package typings.rifatMiio

import typings.abstractThings.mod.Thing
import typings.node.bufferMod.global.Buffer
import typings.rifatMiio.rifatMiioBooleans.`true`
import typings.rifatMiio.rifatMiioStrings.`typeColonair-purifier`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object deviceMod {
  
  @JSImport("@rifat/miio/device", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def device(options: MiioDeviceOptions): js.Promise[MiioDevice] = ^.asInstanceOf[js.Dynamic].applyDynamic("device")(options.asInstanceOf[js.Any]).asInstanceOf[js.Promise[MiioDevice]]
  
  @js.native
  trait AirPurifier3 extends Thing {
    
    def changeBuzzer(value: String): js.Promise[String] = js.native
    
    def changeChildLock(value: String): js.Promise[String] = js.native
    
    def changeFan(value: String): js.Promise[String] = js.native
    
    def changeFanSpeed(value: String): js.Promise[String] = js.native
    
    def changeFavoriteLevel(value: String): js.Promise[String] = js.native
    
    def changeFavoriteSpeed(value: String): js.Promise[String] = js.native
    
    def changeLEDBrightness(value: String): js.Promise[String] = js.native
    
    def changeMode(value: String): js.Promise[String] = js.native
    
    def changePower(value: String): js.Promise[String] = js.native
    
    def childLock(): js.Promise[String] = js.native
    
    def filterLifeLevel(): js.Promise[String] = js.native
    
    @JSName("matches")
    def matches_typeairpurifier(`type`: `typeColonair-purifier`): `true` = js.native
    
    def updateChildLock(value: String): Unit = js.native
    
    def updateFilterLifeLevel(value: String): Unit = js.native
  }
  
  type MiioDevice = Thing | AirPurifier3
  
  trait MiioDeviceOptions extends StObject {
    
    var address: String
    
    var model: js.UndefOr[String] = js.undefined
    
    var port: js.UndefOr[String] = js.undefined
    
    var token: js.UndefOr[String | Buffer] = js.undefined
    
    var withPlaceholder: js.UndefOr[Boolean] = js.undefined
  }
  object MiioDeviceOptions {
    
    inline def apply(address: String): MiioDeviceOptions = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[MiioDeviceOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: MiioDeviceOptions] (val x: Self) extends AnyVal {
      
      inline def setAddress(value: String): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      inline def setModel(value: String): Self = StObject.set(x, "model", value.asInstanceOf[js.Any])
      
      inline def setModelUndefined: Self = StObject.set(x, "model", js.undefined)
      
      inline def setPort(value: String): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
      
      inline def setPortUndefined: Self = StObject.set(x, "port", js.undefined)
      
      inline def setToken(value: String | Buffer): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
      
      inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
      
      inline def setWithPlaceholder(value: Boolean): Self = StObject.set(x, "withPlaceholder", value.asInstanceOf[js.Any])
      
      inline def setWithPlaceholderUndefined: Self = StObject.set(x, "withPlaceholder", js.undefined)
    }
  }
}
