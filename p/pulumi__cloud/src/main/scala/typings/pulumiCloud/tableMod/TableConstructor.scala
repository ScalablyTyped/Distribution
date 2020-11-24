package typings.pulumiCloud.tableMod

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.resourceMod.ResourceOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TableConstructor
  extends /**
  * Creates a new Table.
  *
  * @param name A unique name for the table.
  * @param primaryKey An optional primary key name.
  * @param primaryKeyType An optional primary key type.
  * @param opts A bag of options that controls how this resource behaves.
  */
Instantiable1[/* name */ String, Table]
     with Instantiable2[/* name */ String, /* primaryKey */ Input[String], Table]
     with Instantiable3[
      /* name */ String, 
      js.UndefOr[/* primaryKey */ Input[String]], 
      /* primaryKeyType */ Input[PrimaryKeyType], 
      Table
    ]
     with Instantiable4[
      /* name */ String, 
      js.UndefOr[/* primaryKey */ Input[String]], 
      js.UndefOr[/* primaryKeyType */ Input[PrimaryKeyType]], 
      /* opts */ ResourceOptions, 
      Table
    ]
