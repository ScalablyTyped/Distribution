package typings
package sassDashGraphLib.sassDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph extends js.Object {
  var dir: java.lang.String = js.native
  var extensions: js.Array[java.lang.String] = js.native
  var index: Node = js.native
  var loadPaths: js.Array[java.lang.String] = js.native
  /**
    * Add a sass file to the graph
    * @param {string} filepath Path to the file to visit
    * @param {string} [parent] Parent filepath
    */
  def addFile(filepath: java.lang.String): scala.Unit = js.native
  def addFile(filepath: java.lang.String, parent: java.lang.String): scala.Unit = js.native
  /**
    * A generic visitor that uses an edgeCallback to find the edges to traverse
    * for a node
    * @param {string}   filepath     Path to the file to visit
    * @param {Function} callback     Called when a node is visited
    * @param {Function} edgeCallback Called when we reach an edge
    * @param {string[]} [visited]    Visited edges
    */
  def visit(
    filepath: java.lang.String,
    callback: js.Function2[/* edge */ java.lang.String, /* node */ Node, _],
    edgeCallback: js.Function2[/* errorMsg */ java.lang.String, /* node */ Node, _]
  ): scala.Unit = js.native
  def visit(
    filepath: java.lang.String,
    callback: js.Function2[/* edge */ java.lang.String, /* node */ Node, _],
    edgeCallback: js.Function2[/* errorMsg */ java.lang.String, /* node */ Node, _],
    visited: js.Array[java.lang.String]
  ): scala.Unit = js.native
  /**
    * visits all files that are ancestors of the provided file
    * @param {string}   filepath Path to the file to visit
    * @param {Function} callback Called when a node is visited
    */
  def visitAncestors(
    filepath: java.lang.String,
    callback: js.Function2[/* edge */ java.lang.String, /* node */ Node, _]
  ): scala.Unit = js.native
  /**
    * Visits all files that are descendents of the provided file
    * @param {string}   filepath Path to the file to visit
    * @param {Function} callback Called when a node is visited
    */
  def visitDescendents(
    filepath: java.lang.String,
    callback: js.Function2[/* edge */ java.lang.String, /* node */ Node, _]
  ): scala.Unit = js.native
}

