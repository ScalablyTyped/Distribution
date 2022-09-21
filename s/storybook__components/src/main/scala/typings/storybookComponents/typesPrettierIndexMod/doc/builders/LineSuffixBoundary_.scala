package typings.storybookComponents.typesPrettierIndexMod.doc.builders

import typings.storybookComponents.storybookComponentsStrings.`line-suffix-boundary`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LineSuffixBoundary_
  extends StObject
     with DocCommand {
  
  var `type`: `line-suffix-boundary`
}
object LineSuffixBoundary_ {
  
  inline def apply(): LineSuffixBoundary_ = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")("line-suffix-boundary")
    __obj.asInstanceOf[LineSuffixBoundary_]
  }
  
  extension [Self <: LineSuffixBoundary_](x: Self) {
    
    inline def setType(value: `line-suffix-boundary`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
