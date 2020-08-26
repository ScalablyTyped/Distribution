package typings.pulumiAws.glueConnectionMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.inputMod.glue.ConnectionPhysicalConnectionRequirements
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ConnectionArgs extends js.Object {
  /**
    * The ID of the Data Catalog in which to create the connection. If none is supplied, the AWS account ID is used by default.
    */
  val catalogId: js.UndefOr[Input[String]] = js.native
  /**
    * A map of key-value pairs used as parameters for this connection.
    */
  val connectionProperties: Input[StringDictionary[Input[String]]] = js.native
  /**
    * The type of the connection. Supported are: `JDBC`, `MONGODB`, `KAFKA`. Defaults to `JBDC`.
    */
  val connectionType: js.UndefOr[Input[String]] = js.native
  /**
    * Description of the connection.
    */
  val description: js.UndefOr[Input[String]] = js.native
  /**
    * A list of criteria that can be used in selecting this connection.
    */
  val matchCriterias: js.UndefOr[Input[js.Array[Input[String]]]] = js.native
  /**
    * The name of the connection.
    */
  val name: js.UndefOr[Input[String]] = js.native
  /**
    * A map of physical connection requirements, such as VPC and SecurityGroup. Defined below.
    */
  val physicalConnectionRequirements: js.UndefOr[Input[ConnectionPhysicalConnectionRequirements]] = js.native
}

object ConnectionArgs {
  @scala.inline
  def apply(connectionProperties: Input[StringDictionary[Input[String]]]): ConnectionArgs = {
    val __obj = js.Dynamic.literal(connectionProperties = connectionProperties.asInstanceOf[js.Any])
    __obj.asInstanceOf[ConnectionArgs]
  }
  @scala.inline
  implicit class ConnectionArgsOps[Self <: ConnectionArgs] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setConnectionProperties(value: Input[StringDictionary[Input[String]]]): Self = this.set("connectionProperties", value.asInstanceOf[js.Any])
    @scala.inline
    def setCatalogId(value: Input[String]): Self = this.set("catalogId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCatalogId: Self = this.set("catalogId", js.undefined)
    @scala.inline
    def setConnectionType(value: Input[String]): Self = this.set("connectionType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConnectionType: Self = this.set("connectionType", js.undefined)
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    @scala.inline
    def setMatchCriteriasVarargs(value: Input[String]*): Self = this.set("matchCriterias", js.Array(value :_*))
    @scala.inline
    def setMatchCriterias(value: Input[js.Array[Input[String]]]): Self = this.set("matchCriterias", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMatchCriterias: Self = this.set("matchCriterias", js.undefined)
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setPhysicalConnectionRequirements(value: Input[ConnectionPhysicalConnectionRequirements]): Self = this.set("physicalConnectionRequirements", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePhysicalConnectionRequirements: Self = this.set("physicalConnectionRequirements", js.undefined)
  }
  
}

