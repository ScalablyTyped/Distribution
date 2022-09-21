package typings.reactNativeCommunityCliDoctor.anon

import typings.reactNativeCommunityCliDoctor.typesMod.AvailableInformation
import typings.reactNativeCommunityCliDoctor.typesMod.NotFound
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AndroidStudio extends StObject {
  
  var `Android Studio`: AvailableInformation | NotFound
  
  var Emacs: AvailableInformation
  
  var Nano: AvailableInformation
  
  var VSCode: AvailableInformation
  
  var Vim: AvailableInformation
  
  var Xcode: AvailableInformation
}
object AndroidStudio {
  
  inline def apply(
    `Android Studio`: AvailableInformation | NotFound,
    Emacs: AvailableInformation,
    Nano: AvailableInformation,
    VSCode: AvailableInformation,
    Vim: AvailableInformation,
    Xcode: AvailableInformation
  ): AndroidStudio = {
    val __obj = js.Dynamic.literal(Emacs = Emacs.asInstanceOf[js.Any], Nano = Nano.asInstanceOf[js.Any], VSCode = VSCode.asInstanceOf[js.Any], Vim = Vim.asInstanceOf[js.Any], Xcode = Xcode.asInstanceOf[js.Any])
    __obj.updateDynamic("Android Studio")((`Android Studio`).asInstanceOf[js.Any])
    __obj.asInstanceOf[AndroidStudio]
  }
  
  extension [Self <: AndroidStudio](x: Self) {
    
    inline def `setAndroid Studio`(value: AvailableInformation | NotFound): Self = StObject.set(x, "Android Studio", value.asInstanceOf[js.Any])
    
    inline def setEmacs(value: AvailableInformation): Self = StObject.set(x, "Emacs", value.asInstanceOf[js.Any])
    
    inline def setNano(value: AvailableInformation): Self = StObject.set(x, "Nano", value.asInstanceOf[js.Any])
    
    inline def setVSCode(value: AvailableInformation): Self = StObject.set(x, "VSCode", value.asInstanceOf[js.Any])
    
    inline def setVim(value: AvailableInformation): Self = StObject.set(x, "Vim", value.asInstanceOf[js.Any])
    
    inline def setXcode(value: AvailableInformation): Self = StObject.set(x, "Xcode", value.asInstanceOf[js.Any])
  }
}
