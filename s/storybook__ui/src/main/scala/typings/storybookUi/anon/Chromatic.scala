package typings.storybookUi.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Chromatic extends StObject {
  
  var chromatic: Disable = js.native
}
object Chromatic {
  
  @scala.inline
  def apply(chromatic: Disable): Chromatic = {
    val __obj = js.Dynamic.literal(chromatic = chromatic.asInstanceOf[js.Any])
    __obj.asInstanceOf[Chromatic]
  }
  
  @scala.inline
  implicit class ChromaticMutableBuilder[Self <: Chromatic] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChromatic(value: Disable): Self = StObject.set(x, "chromatic", value.asInstanceOf[js.Any])
  }
}
