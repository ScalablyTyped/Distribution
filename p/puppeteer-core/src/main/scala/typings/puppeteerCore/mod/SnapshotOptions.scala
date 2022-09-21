package typings.puppeteerCore.mod

import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnapshotOptions extends StObject {
  
  /**
    * Prune uninteresting nodes from the tree.
    * @defaultValue true
    */
  var interestingOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Root node to get the accessibility tree for
    * @defaultValue The root node of the entire page.
    */
  var root: js.UndefOr[ElementHandle[Node]] = js.undefined
}
object SnapshotOptions {
  
  inline def apply(): SnapshotOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshotOptions]
  }
  
  extension [Self <: SnapshotOptions](x: Self) {
    
    inline def setInterestingOnly(value: Boolean): Self = StObject.set(x, "interestingOnly", value.asInstanceOf[js.Any])
    
    inline def setInterestingOnlyUndefined: Self = StObject.set(x, "interestingOnly", js.undefined)
    
    inline def setRoot(value: ElementHandle[Node]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    inline def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
