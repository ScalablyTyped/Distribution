package typings.recast

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object fastPathMod extends Shortcut {
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("recast/lib/fast-path", JSImport.Default)
  @js.native
  class default protected ()
    extends StObject
       with FastPathType {
    def this(value: js.Any) = this()
  }
  @JSImport("recast/lib/fast-path", JSImport.Default)
  @js.native
  val default: FastPathConstructor = js.native
  
  @js.native
  trait FastPathConstructor
    extends StObject
       with Instantiable1[/* value */ js.Any, FastPathType] {
    
    def from(obj: js.Any): js.Any = js.native
  }
  
  @js.native
  trait FastPathType extends StObject {
    
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
    
    var stack: js.Array[js.Any] = js.native
    
    def valueIsDuplicate(): js.Any = js.native
  }
  
  type _To = FastPathConstructor
  
  /* This means you don't have to write `default`, but can instead just say `fastPathMod.foo` */
  override def _to: FastPathConstructor = default
}
