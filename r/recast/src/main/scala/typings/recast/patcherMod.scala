package typings.recast

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("recast/lib/patcher", JSImport.Namespace)
@js.native
object patcherMod extends js.Object {
  
  def getReprinter(path: js.Any): js.UndefOr[js.Function1[/* print */ js.Any, _]] = js.native
  
  @js.native
  class Patcher protected () extends PatcherType {
    def this(lines: js.Any) = this()
  }
  @js.native
  object Patcher extends TopLevel[PatcherConstructor]
  
  @js.native
  trait PatcherConstructor
    extends Instantiable1[/* lines */ js.Any, PatcherType]
  
  @js.native
  trait PatcherType extends js.Object {
    
    def deleteComments(node: js.Any): js.Any = js.native
    
    def get(): js.Any = js.native
    def get(loc: js.Any): js.Any = js.native
    
    def replace(loc: js.Any, lines: js.Any): js.Any = js.native
    
    def tryToReprintComments(newNode: js.Any, oldNode: js.Any, print: js.Any): js.Any = js.native
  }
}
