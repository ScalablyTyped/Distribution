package typings.schemaUtils.validationErrorMod

import typings.ajv.mod.ErrorObject
import typings.ajv.mod.ErrorParameters
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined ajv.ajv.ErrorObject & {  children :std.Array<ajv.ajv.ErrorObject> | undefined} */
@js.native
trait SchemaUtilErrorObject extends js.Object {
  
  var children: js.UndefOr[js.Array[ErrorObject]] = js.native
  
  var data: js.UndefOr[js.Any] = js.native
  
  var dataPath: String = js.native
  
  var keyword: String = js.native
  
  // Excluded if messages set to false.
  var message: js.UndefOr[String] = js.native
  
  var params: ErrorParameters = js.native
  
  var parentSchema: js.UndefOr[js.Object] = js.native
  
  // Added to validation errors of propertyNames keyword schema
  var propertyName: js.UndefOr[String] = js.native
  
  // These are added with the `verbose` option.
  var schema: js.UndefOr[js.Any] = js.native
  
  var schemaPath: String = js.native
}
object SchemaUtilErrorObject {
  
  @scala.inline
  def apply(dataPath: String, keyword: String, params: ErrorParameters, schemaPath: String): SchemaUtilErrorObject = {
    val __obj = js.Dynamic.literal(dataPath = dataPath.asInstanceOf[js.Any], keyword = keyword.asInstanceOf[js.Any], params = params.asInstanceOf[js.Any], schemaPath = schemaPath.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaUtilErrorObject]
  }
  
  @scala.inline
  implicit class SchemaUtilErrorObjectOps[Self <: SchemaUtilErrorObject] (val x: Self) extends AnyVal {
    
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
    def setDataPath(value: String): Self = this.set("dataPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyword(value: String): Self = this.set("keyword", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParams(value: ErrorParameters): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchemaPath(value: String): Self = this.set("schemaPath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildrenVarargs(value: ErrorObject*): Self = this.set("children", js.Array(value :_*))
    
    @scala.inline
    def setChildren(value: js.Array[ErrorObject]): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    
    @scala.inline
    def setParentSchema(value: js.Object): Self = this.set("parentSchema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParentSchema: Self = this.set("parentSchema", js.undefined)
    
    @scala.inline
    def setPropertyName(value: String): Self = this.set("propertyName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePropertyName: Self = this.set("propertyName", js.undefined)
    
    @scala.inline
    def setSchema(value: js.Any): Self = this.set("schema", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchema: Self = this.set("schema", js.undefined)
  }
}
