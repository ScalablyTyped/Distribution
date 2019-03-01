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

object Connection {
  @scala.inline
  def apply(
    createFetchQuery: js.Function4[
      java.lang.String, 
      java.lang.String, 
      sharedbLib.Anon_Results, 
      js.Function2[/* err */ Error, /* results */ js.Any, _], 
      sharedbLib.libSharedbMod.Query
    ],
    createSubscribeQuery: js.Function4[
      java.lang.String, 
      java.lang.String, 
      sharedbLib.Anon_Results, 
      js.Function2[/* err */ Error, /* results */ js.Any, _], 
      sharedbLib.libSharedbMod.Query
    ],
    get: js.Function2[java.lang.String, java.lang.String, sharedbLib.libSharedbMod.Doc]
  ): Connection = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("createFetchQuery")(createFetchQuery)
    __obj.updateDynamic("createSubscribeQuery")(createSubscribeQuery)
    __obj.updateDynamic("get")(get)
    __obj.asInstanceOf[Connection]
  }
}

