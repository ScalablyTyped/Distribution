package typings.atPulumiAws

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatabaseName extends js.Object {
  var databaseName: String
  var tables: js.Array[String]
}

object Anon_DatabaseName {
  @scala.inline
  def apply(databaseName: String, tables: js.Array[String]): Anon_DatabaseName = {
    val __obj = js.Dynamic.literal(databaseName = databaseName, tables = tables)
  
    __obj.asInstanceOf[Anon_DatabaseName]
  }
}

