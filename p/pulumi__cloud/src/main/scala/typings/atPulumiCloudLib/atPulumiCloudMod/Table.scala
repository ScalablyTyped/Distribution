package typings
package atPulumiCloudLib.atPulumiCloudMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@pulumi/cloud", "Table")
@js.native
class TableCls protected ()
  extends atPulumiCloudLib.tableMod.Table {
  /**
    * Creates a new Table.
    *
    * @param name A unique name for the table.
    * @param primaryKey An optional primary key name.
    * @param primaryKeyType An optional primary key type.
    * @param opts A bag of options that controls how this resource behaves.
    */
  def this(name: java.lang.String) = this()
  def this(name: java.lang.String, primaryKey: atPulumiPulumiLib.outputMod.Input[java.lang.String]) = this()
  def this(name: java.lang.String, primaryKey: atPulumiPulumiLib.outputMod.Input[java.lang.String], primaryKeyType: atPulumiPulumiLib.outputMod.Input[atPulumiCloudLib.tableMod.PrimaryKeyType]) = this()
  def this(name: java.lang.String, primaryKey: atPulumiPulumiLib.outputMod.Input[java.lang.String], primaryKeyType: atPulumiPulumiLib.outputMod.Input[atPulumiCloudLib.tableMod.PrimaryKeyType], opts: atPulumiPulumiLib.resourceMod.ResourceOptions) = this()
}

