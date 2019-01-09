package typings
package reactDashLoadableLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_GetBundles extends js.Object {
  var ReactLoadablePlugin: org.scalablytyped.runtime.Instantiable1[
    /* opts */ js.UndefOr[/* opts */ reactDashLoadableLib.webpackMod.LoadableExportNs.Options], 
    reactDashLoadableLib.webpackMod.LoadableExportNs.ReactLoadablePlugin
  ] = js.native
  @JSName("getBundles")
  var getBundles_Original: js.Function2[
    /* manifest */ reactDashLoadableLib.webpackMod.LoadableExportNs.Manifest, 
    /* moduleIds */ js.Array[java.lang.String], 
    js.Array[reactDashLoadableLib.webpackMod.LoadableExportNs.Bundle]
  ] = js.native
  def getBundles(
    manifest: reactDashLoadableLib.webpackMod.LoadableExportNs.Manifest,
    moduleIds: js.Array[java.lang.String]
  ): js.Array[reactDashLoadableLib.webpackMod.LoadableExportNs.Bundle] = js.native
}

