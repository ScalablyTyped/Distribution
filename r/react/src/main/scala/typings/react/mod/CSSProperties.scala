package typings.react.mod

import typings.csstype.mod.Properties
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CSSProperties
  extends StObject
     with Properties[String | Double] {
  
  /* fake member to keep old syntax */
  val hack: js.UndefOr[js.Any] = js.undefined
}
object CSSProperties {
  
  @scala.inline
  def apply(): CSSProperties = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CSSProperties]
  }
  
  @scala.inline
  implicit class CSSPropertiesMutableBuilder[Self <: CSSProperties] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHack(value: js.Any): Self = StObject.set(x, "hack", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHackUndefined: Self = StObject.set(x, "hack", js.undefined)
  }
}
