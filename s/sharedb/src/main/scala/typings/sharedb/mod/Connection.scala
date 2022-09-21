package typings.sharedb.mod

import typings.sharedb.anon.Results
import typings.sharedb.sharedbMod.Socket
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * @deprecated Use the `Connection` type from 'sharedb/lib/client' instead, as that's where it
  *   lives in the actual source code.
  */
@JSImport("sharedb", "Connection")
@js.native
open class Connection protected () extends StObject {
  def this(socket: Socket) = this()
  
  def createFetchQuery(
    collectionName: String,
    query: String,
    options: Results,
    callback: js.Function2[/* err */ Error, /* results */ Any, Any]
  ): typings.sharedb.sharedbMod.Query[Any] = js.native
  
  def createSubscribeQuery(
    collectionName: String,
    query: String,
    options: Results,
    callback: js.Function2[/* err */ Error, /* results */ Any, Any]
  ): typings.sharedb.sharedbMod.Query[Any] = js.native
  
  def get(collectionName: String, documentID: String): typings.sharedb.sharedbMod.Doc[Any] = js.native
}
