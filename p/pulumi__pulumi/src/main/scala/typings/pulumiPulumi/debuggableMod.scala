package typings.pulumiPulumi

import typings.std.Set
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pulumi/pulumi/runtime/debuggable", JSImport.Namespace)
@js.native
object debuggableMod extends js.Object {
  
  def leakedPromises(): js.Tuple2[Set[js.Promise[_]], String] = js.native
  
  def promiseDebugString(p: js.Promise[_]): String = js.native
}
