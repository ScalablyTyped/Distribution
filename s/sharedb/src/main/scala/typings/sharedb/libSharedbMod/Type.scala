package typings.sharedb.libSharedbMod

import org.scalablytyped.runtime.StringDictionary
import typings.sharedb.sharedbStrings.left
import typings.sharedb.sharedbStrings.right
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type
  extends StObject
     with // Users can use server middleware to add additional metadata to snapshots.
/* key */ StringDictionary[Any] {
  
  @JSName("apply")
  def apply(snapshot: Any, op: Any): Any = js.native
  
  def compose(op1: Any, op2: Any): Any = js.native
  
  def create(): Any = js.native
  def create(initialData: Any): Any = js.native
  
  var deserialize: js.UndefOr[js.Function1[/* data */ Any, Any]] = js.native
  
  var invert: js.UndefOr[js.Function1[/* op */ Any, Any]] = js.native
  
  var name: js.UndefOr[String] = js.native
  
  var normalize: js.UndefOr[js.Function1[/* op */ Any, Any]] = js.native
  
  var serialize: js.UndefOr[js.Function1[/* snapshot */ Any, Any]] = js.native
  
  def transform(op1: Any, op2: Any, side: left | right): Any = js.native
  
  var transformCursor: js.UndefOr[js.Function3[/* cursor */ Any, /* op */ Any, /* isOwnOp */ Boolean, Any]] = js.native
  
  var uri: js.UndefOr[String] = js.native
}
