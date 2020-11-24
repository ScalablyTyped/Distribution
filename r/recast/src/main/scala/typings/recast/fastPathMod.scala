package typings.recast

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recast/lib/fast-path", JSImport.Namespace)
@js.native
object fastPathMod extends js.Object {
  
  @js.native
  trait FastPathConstructor
    extends Instantiable1[/* value */ js.Any, FastPathType] {
    
    def from(obj: js.Any): js.Any = js.native
  }
  
  @js.native
  trait FastPathType extends js.Object {
    
    def call(callback: js.Any, names: js.Any*): js.Any = js.native
    
    def canBeFirstInStatement(): js.Any = js.native
    
    def copy(): js.Any = js.native
    
    def each(callback: js.Any, names: js.Any*): js.Any = js.native
    
    def firstInStatement(): js.Any = js.native
    
    def getName(): js.Any = js.native
    
    def getNextToken(node: js.Any): js.Any = js.native
    
    def getNode(): js.Any = js.native
    def getNode(count: Double): js.Any = js.native
    
    def getParentNode(): js.Any = js.native
    def getParentNode(count: Double): js.Any = js.native
    
    def getPrevToken(node: js.Any): js.Any = js.native
    
    def getRootValue(): js.Any = js.native
    
    def getValue(): js.Any = js.native
    
    def hasParens(): js.Any = js.native
    
    def map(callback: js.Any, names: js.Any*): js.Any = js.native
    
    def needsParens(assumeExpressionContext: js.Any): js.Any = js.native
    
    var stack: js.Array[_] = js.native
    
    def valueIsDuplicate(): js.Any = js.native
  }
  
  @js.native
  class default protected () extends FastPathType {
    def this(value: js.Any) = this()
  }
  @js.native
  object default extends TopLevel[FastPathConstructor]
}
