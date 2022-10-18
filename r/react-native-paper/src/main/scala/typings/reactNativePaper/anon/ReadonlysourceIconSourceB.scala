package typings.reactNativePaper.anon

import typings.reactNative.mod.ImageURISource
import typings.reactNativePaper.libTypescriptComponentsIconMod.IconSourceBase
import typings.reactNativePaper.reactNativePaperStrings.auto
import typings.reactNativePaper.reactNativePaperStrings.ltr
import typings.reactNativePaper.reactNativePaperStrings.rtl
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Readonly<{  source :react-native-paper.react-native-paper/lib/typescript/components/Icon.IconSourceBase,   direction :'rtl' | 'ltr' | 'auto'}> */
trait ReadonlysourceIconSourceB extends StObject {
  
  val direction: rtl | ltr | auto
  
  val source: IconSourceBase
}
object ReadonlysourceIconSourceB {
  
  inline def apply(direction: rtl | ltr | auto, source: IconSourceBase): ReadonlysourceIconSourceB = {
    val __obj = js.Dynamic.literal(direction = direction.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlysourceIconSourceB]
  }
  
  extension [Self <: ReadonlysourceIconSourceB](x: Self) {
    
    inline def setDirection(value: rtl | ltr | auto): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
    
    inline def setSource(value: IconSourceBase): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setSourceVarargs(value: ImageURISource*): Self = StObject.set(x, "source", js.Array(value*))
  }
}
