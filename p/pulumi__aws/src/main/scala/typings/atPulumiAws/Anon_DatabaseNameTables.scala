package typings.atPulumiAws

import typings.atPulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DatabaseNameTables extends js.Object {
  var databaseName: Input[String]
  var tables: Input[js.Array[Input[String]]]
}

object Anon_DatabaseNameTables {
  @scala.inline
  def apply(databaseName: Input[String], tables: Input[js.Array[Input[String]]]): Anon_DatabaseNameTables = {
    val __obj = js.Dynamic.literal(databaseName = databaseName.asInstanceOf[js.Any], tables = tables.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_DatabaseNameTables]
  }
}

