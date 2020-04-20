package typings.sigmajs.SigmaJs

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Canvas extends js.Object {
  var edges: StringDictionary[
    js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ js.Any, Unit]
  ]
  var labels: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]]
  var nodes: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]]
}

object Canvas {
  @scala.inline
  def apply(
    edges: StringDictionary[
      js.Function4[/* edge */ Edge, /* source */ Node, /* target */ Node, /* repeated */ js.Any, Unit]
    ],
    labels: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]],
    nodes: StringDictionary[js.Function2[/* node */ Node, /* repeated */ js.Any, Unit]]
  ): Canvas = {
    val __obj = js.Dynamic.literal(edges = edges.asInstanceOf[js.Any], labels = labels.asInstanceOf[js.Any], nodes = nodes.asInstanceOf[js.Any])
    __obj.asInstanceOf[Canvas]
  }
}

