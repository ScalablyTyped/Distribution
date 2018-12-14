package typings
package sigmajsLib.SigmaJsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Canvas extends js.Object {
  var edges: org.scalablytyped.runtime.StringDictionary[
    js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */js.Any, scala.Unit]
  ]
  var labels: org.scalablytyped.runtime.StringDictionary[js.Function2[/* node */ Node, /* repeated */js.Any, scala.Unit]]
  var nodes: org.scalablytyped.runtime.StringDictionary[js.Function2[/* node */ Node, /* repeated */js.Any, scala.Unit]]
}

