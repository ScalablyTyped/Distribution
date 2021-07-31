package typings.sinonChrome.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contentSettings {
  
  @JSImport("sinon-chrome", "contentSettings")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("sinon-chrome", "contentSettings.cookies")
  @js.native
  def cookies: StubbedContentSetting = js.native
  @scala.inline
  def cookies_=(x: StubbedContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cookies")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contentSettings.images")
  @js.native
  def images: StubbedContentSetting = js.native
  @scala.inline
  def images_=(x: StubbedContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("images")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contentSettings.javascript")
  @js.native
  def javascript: StubbedContentSetting = js.native
  @scala.inline
  def javascript_=(x: StubbedContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("javascript")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contentSettings.notifications")
  @js.native
  def notifications: StubbedContentSetting = js.native
  @scala.inline
  def notifications_=(x: StubbedContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("notifications")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contentSettings.plugins")
  @js.native
  def plugins: StubbedContentSetting = js.native
  @scala.inline
  def plugins_=(x: StubbedContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("plugins")(x.asInstanceOf[js.Any])
  
  @JSImport("sinon-chrome", "contentSettings.popups")
  @js.native
  def popups: StubbedContentSetting = js.native
  @scala.inline
  def popups_=(x: StubbedContentSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("popups")(x.asInstanceOf[js.Any])
  
  trait StubbedContentSetting extends StObject {
    
    // Methods
    def clear(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
    ): js.Any
    @JSName("clear")
    var clear_Original: SinonChromeStub
    
    // Methods
    def get(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
    ): js.Any
    
    // Methods
    def getResourceIdentifiers(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
    ): js.Any
    @JSName("getResourceIdentifiers")
    var getResourceIdentifiers_Original: SinonChromeStub
    
    @JSName("get")
    var get_Original: SinonChromeStub
    
    // Methods
    def set(
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: js.Array[js.Any]
    ): js.Any
    @JSName("set")
    var set_Original: SinonChromeStub
  }
  object StubbedContentSetting {
    
    @scala.inline
    def apply(
      clear: SinonChromeStub,
      get: SinonChromeStub,
      getResourceIdentifiers: SinonChromeStub,
      set: SinonChromeStub
    ): StubbedContentSetting = {
      val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], get = get.asInstanceOf[js.Any], getResourceIdentifiers = getResourceIdentifiers.asInstanceOf[js.Any], set = set.asInstanceOf[js.Any])
      __obj.asInstanceOf[StubbedContentSetting]
    }
    
    @scala.inline
    implicit class StubbedContentSettingMutableBuilder[Self <: StubbedContentSetting] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setClear(value: SinonChromeStub): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGet(value: SinonChromeStub): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGetResourceIdentifiers(value: SinonChromeStub): Self = StObject.set(x, "getResourceIdentifiers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSet(value: SinonChromeStub): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    }
  }
}
