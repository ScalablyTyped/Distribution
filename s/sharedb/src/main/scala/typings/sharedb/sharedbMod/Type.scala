package typings.sharedb.sharedbMod

import org.scalablytyped.runtime.StringDictionary
import typings.sharedb.sharedbStrings.left
import typings.sharedb.sharedbStrings.right
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type
  extends // Users can use server middleware to add additional metadata to snapshots.
/* key */ StringDictionary[js.Any] {
  
  @JSName("apply")
  def apply(snapshot: js.Any, op: js.Any): js.Any = js.native
  
  def compose(op1: js.Any, op2: js.Any): js.Any = js.native
  
  def create(): js.Any = js.native
  def create(initialData: js.Any): js.Any = js.native
  
  var deserialize: js.UndefOr[js.Function1[/* data */ js.Any, _]] = js.native
  
  var invert: js.UndefOr[js.Function1[/* op */ js.Any, _]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var normalize: js.UndefOr[js.Function1[/* op */ js.Any, _]] = js.native
  
  var serialize: js.UndefOr[js.Function1[/* snapshot */ js.Any, _]] = js.native
  
  var transformCursor: js.UndefOr[js.Function3[/* cursor */ js.Any, /* op */ js.Any, /* isOwnOp */ Boolean, _]] = js.native
  
  @JSName("transform")
  def transform_left(op1: js.Any, op2: js.Any, side: left): js.Any = js.native
  @JSName("transform")
  def transform_right(op1: js.Any, op2: js.Any, side: right): js.Any = js.native
  
  var uri: js.UndefOr[String] = js.native
}
