package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Canvas extends js.Object {
  var edges: ScalablyTyped.runtime.StringDictionary[
    js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */js.Any, scala.Unit]
  ]
  var labels: ScalablyTyped.runtime.StringDictionary[js.Function2[/* node */ Node, /* repeated */js.Any, scala.Unit]]
  var nodes: ScalablyTyped.runtime.StringDictionary[js.Function2[/* node */ Node, /* repeated */js.Any, scala.Unit]]
}

