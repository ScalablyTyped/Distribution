package typings.recast

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object patcherMod {
  
  @JSImport("recast/lib/patcher", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
  @JSImport("recast/lib/patcher", "Patcher")
  @js.native
  class Patcher protected ()
    extends StObject
       with PatcherType {
    def this(lines: js.Any) = this()
  }
  @JSImport("recast/lib/patcher", "Patcher")
  @js.native
  val Patcher: PatcherConstructor = js.native
  
  @scala.inline
  def getReprinter(path: js.Any): js.UndefOr[js.Function1[/* print */ js.Any, js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("getReprinter")(path.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[js.Function1[/* print */ js.Any, js.Any]]]
  
  @js.native
  trait PatcherConstructor
    extends StObject
       with Instantiable1[/* lines */ js.Any, PatcherType]
  
  @js.native
  trait PatcherType extends StObject {
    
    def deleteComments(node: js.Any): js.Any = js.native
    
    def get(): js.Any = js.native
    def get(loc: js.Any): js.Any = js.native
    
    def replace(loc: js.Any, lines: js.Any): js.Any = js.native
    
    def tryToReprintComments(newNode: js.Any, oldNode: js.Any, print: js.Any): js.Any = js.native
  }
}
