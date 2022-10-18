package typings.quadstore

import typings.quadstore.distCjsQuadstoreMod.Quadstore
import typings.quadstore.distCjsTypesMod.ApproximateSizeResult
import typings.quadstore.distCjsTypesMod.GetOpts
import typings.quadstore.distCjsTypesMod.Pattern
import typings.quadstore.distCjsTypesMod.QuadStreamResultWithInternals
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distCjsGetMod {
  
  @JSImport("quadstore/dist/cjs/get", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def getApproximateSize(store: Quadstore, pattern: Pattern, opts: GetOpts): js.Promise[ApproximateSizeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getApproximateSize")(store.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ApproximateSizeResult]]
  
  inline def getStream(store: Quadstore, pattern: Pattern, opts: GetOpts): js.Promise[QuadStreamResultWithInternals] = (^.asInstanceOf[js.Dynamic].applyDynamic("getStream")(store.asInstanceOf[js.Any], pattern.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[QuadStreamResultWithInternals]]
}
