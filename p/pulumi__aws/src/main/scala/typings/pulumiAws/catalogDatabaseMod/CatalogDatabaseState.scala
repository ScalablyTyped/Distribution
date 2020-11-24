package typings.pulumiAws.catalogDatabaseMod

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiPulumi.outputMod.Input
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CatalogDatabaseState extends js.Object {
  
  /**
    * The ARN of the Glue Catalog Database.
    */
  val arn: js.UndefOr[Input[String]] = js.native
  
  /**
    * ID of the Glue Catalog to create the database in. If omitted, this defaults to the AWS Account ID.
    */
  val catalogId: js.UndefOr[Input[String]] = js.native
  
  /**
    * Description of the database.
    */
  val description: js.UndefOr[Input[String]] = js.native
  
  /**
    * The location of the database (for example, an HDFS path).
    */
  val locationUri: js.UndefOr[Input[String]] = js.native
  
  /**
    * The name of the database.
    */
  val name: js.UndefOr[Input[String]] = js.native
  
  /**
    * A list of key-value pairs that define parameters and properties of the database.
    */
  val parameters: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.native
}
object CatalogDatabaseState {
  
  @scala.inline
  def apply(): CatalogDatabaseState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CatalogDatabaseState]
  }
  
  @scala.inline
  implicit class CatalogDatabaseStateOps[Self <: CatalogDatabaseState] (val x: Self) extends AnyVal {
    
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
    def setArn(value: Input[String]): Self = this.set("arn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteArn: Self = this.set("arn", js.undefined)
    
    @scala.inline
    def setCatalogId(value: Input[String]): Self = this.set("catalogId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCatalogId: Self = this.set("catalogId", js.undefined)
    
    @scala.inline
    def setDescription(value: Input[String]): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setLocationUri(value: Input[String]): Self = this.set("locationUri", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocationUri: Self = this.set("locationUri", js.undefined)
    
    @scala.inline
    def setName(value: Input[String]): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    
    @scala.inline
    def setParameters(value: Input[StringDictionary[Input[String]]]): Self = this.set("parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParameters: Self = this.set("parameters", js.undefined)
  }
}
