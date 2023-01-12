package typings.raml1Parser.distParserHighLevelASTMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbstractWrapperNode extends StObject {
  
  /**
    * @return RAML version of the node. "RAML10" for RAML 1.0 and "RAML08" for RAML 0.8.
    */
  def RAMLVersion(): String
  
  /**
    * @return Actual name of instance interface
    **/
  def kind(): String
  
  /**
    * @hidden
    **/
  def wrapperClassName(): String
}
object AbstractWrapperNode {
  
  inline def apply(RAMLVersion: () => String, kind: () => String, wrapperClassName: () => String): AbstractWrapperNode = {
    val __obj = js.Dynamic.literal(RAMLVersion = js.Any.fromFunction0(RAMLVersion), kind = js.Any.fromFunction0(kind), wrapperClassName = js.Any.fromFunction0(wrapperClassName))
    __obj.asInstanceOf[AbstractWrapperNode]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AbstractWrapperNode] (val x: Self) extends AnyVal {
    
    inline def setKind(value: () => String): Self = StObject.set(x, "kind", js.Any.fromFunction0(value))
    
    inline def setRAMLVersion(value: () => String): Self = StObject.set(x, "RAMLVersion", js.Any.fromFunction0(value))
    
    inline def setWrapperClassName(value: () => String): Self = StObject.set(x, "wrapperClassName", js.Any.fromFunction0(value))
  }
}
