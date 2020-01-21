package typings.sassGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Graph extends js.Object {
  var dir: String = js.native
  var extensions: js.Array[String] = js.native
  var index: Node = js.native
  var loadPaths: js.Array[String] = js.native
  /**
    * Add a sass file to the graph
    * @param {string} filepath Path to the file to visit
    * @param {string} [parent] Parent filepath
    */
  def addFile(filepath: String): Unit = js.native
  def addFile(filepath: String, parent: String): Unit = js.native
  /**
    * A generic visitor that uses an edgeCallback to find the edges to traverse
    * for a node
    * @param {string}   filepath     Path to the file to visit
    * @param {Function} callback     Called when a node is visited
    * @param {Function} edgeCallback Called when we reach an edge
    * @param {string[]} [visited]    Visited edges
    */
  def visit(
    filepath: String,
    callback: js.Function2[/* edge */ String, /* node */ Node, _],
    edgeCallback: js.Function2[/* errorMsg */ String, /* node */ Node, _]
  ): Unit = js.native
  def visit(
    filepath: String,
    callback: js.Function2[/* edge */ String, /* node */ Node, _],
    edgeCallback: js.Function2[/* errorMsg */ String, /* node */ Node, _],
    visited: js.Array[String]
  ): Unit = js.native
  /**
    * visits all files that are ancestors of the provided file
    * @param {string}   filepath Path to the file to visit
    * @param {Function} callback Called when a node is visited
    */
  def visitAncestors(filepath: String, callback: js.Function2[/* edge */ String, /* node */ Node, _]): Unit = js.native
  /**
    * Visits all files that are descendents of the provided file
    * @param {string}   filepath Path to the file to visit
    * @param {Function} callback Called when a node is visited
    */
  def visitDescendents(filepath: String, callback: js.Function2[/* edge */ String, /* node */ Node, _]): Unit = js.native
}

