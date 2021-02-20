package typings.pulumiPulumi

import typings.std.Set
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object debuggableMod {
  
  @JSImport("@pulumi/pulumi/runtime/debuggable", "leakedPromises")
  @js.native
  def leakedPromises(): js.Tuple2[Set[js.Promise[_]], String] = js.native
  
  @JSImport("@pulumi/pulumi/runtime/debuggable", "promiseDebugString")
  @js.native
  def promiseDebugString(p: js.Promise[_]): String = js.native
}
