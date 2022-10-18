package typings.reactBlessed.mod

import typings.reactBlessed.anon.Bg
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ProgressBarStyle
  extends StObject
     with ElementStyle {
  
  var bar: js.UndefOr[Bg] = js.undefined
}
object ProgressBarStyle {
  
  inline def apply(): ProgressBarStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ProgressBarStyle]
  }
  
  extension [Self <: ProgressBarStyle](x: Self) {
    
    inline def setBar(value: Bg): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    inline def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
  }
}
