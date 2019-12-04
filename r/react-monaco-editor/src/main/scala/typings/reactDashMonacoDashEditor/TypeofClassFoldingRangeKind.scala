package typings.reactDashMonacoDashEditor

import org.scalablytyped.runtime.Instantiable1
import typings.monacoDashEditor.monacoDashEditorMod.languages.FoldingRangeKind
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofClassFoldingRangeKind extends Instantiable1[/* value */ String, FoldingRangeKind] {
  /**
    * Kind for folding range representing a comment. The value of the kind is 'comment'.
    */
  val Comment: FoldingRangeKind = js.native
  /**
    * Kind for folding range representing a import. The value of the kind is 'imports'.
    */
  val Imports: FoldingRangeKind = js.native
  /**
    * Kind for folding range representing regions (for example marked by `#region`, `#endregion`).
    * The value of the kind is 'region'.
    */
  val Region: FoldingRangeKind = js.native
}

