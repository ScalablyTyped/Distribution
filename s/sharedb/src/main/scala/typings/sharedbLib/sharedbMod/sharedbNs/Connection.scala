package typings
package sharedbLib.sharedbMod.sharedbNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait Connection extends js.Object {
  def createFetchQuery(
    collectionName: java.lang.String,
    query: java.lang.String,
    options: sharedbLib.Anon_Results,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): sharedbLib.libSharedbMod.Query
  def createSubscribeQuery(
    collectionName: java.lang.String,
    query: java.lang.String,
    options: sharedbLib.Anon_Results,
    callback: js.Function2[/* err */ Error, /* results */ js.Any, _]
  ): sharedbLib.libSharedbMod.Query
  def get(collectionName: java.lang.String, documentID: java.lang.String): sharedbLib.libSharedbMod.Doc
}

