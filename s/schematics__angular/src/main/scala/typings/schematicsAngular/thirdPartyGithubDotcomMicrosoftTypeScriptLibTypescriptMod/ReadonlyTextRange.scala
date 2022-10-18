package typings.schematicsAngular.thirdPartyGithubDotcomMicrosoftTypeScriptLibTypescriptMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadonlyTextRange extends StObject {
  
  val end: Double
  
  val pos: Double
}
object ReadonlyTextRange {
  
  inline def apply(end: Double, pos: Double): ReadonlyTextRange = {
    val __obj = js.Dynamic.literal(end = end.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadonlyTextRange]
  }
  
  extension [Self <: ReadonlyTextRange](x: Self) {
    
    inline def setEnd(value: Double): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
    
    inline def setPos(value: Double): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
  }
}
