package typings.puppeteer.mod

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SnapshopOptions extends StObject {
  
  /**
    * Prune uninteresting nodes from the tree.
    * @default true
    */
  var interestingOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * The root DOM element for the snapshot.
    * @default document.body
    */
  var root: js.UndefOr[ElementHandle[Element]] = js.native
}
object SnapshopOptions {
  
  @scala.inline
  def apply(): SnapshopOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnapshopOptions]
  }
  
  @scala.inline
  implicit class SnapshopOptionsMutableBuilder[Self <: SnapshopOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInterestingOnly(value: Boolean): Self = StObject.set(x, "interestingOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInterestingOnlyUndefined: Self = StObject.set(x, "interestingOnly", js.undefined)
    
    @scala.inline
    def setRoot(value: ElementHandle[Element]): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRootUndefined: Self = StObject.set(x, "root", js.undefined)
  }
}
