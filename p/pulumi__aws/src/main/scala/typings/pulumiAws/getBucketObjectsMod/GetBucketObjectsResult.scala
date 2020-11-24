package typings.pulumiAws.getBucketObjectsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetBucketObjectsResult extends js.Object {
  
  val bucket: String = js.native
  
  /**
    * List of any keys between `prefix` and the next occurrence of `delimiter` (i.e., similar to subdirectories of the `prefix` "directory"); the list is only returned when you specify `delimiter`
    */
  val commonPrefixes: js.Array[String] = js.native
  
  val delimiter: js.UndefOr[String] = js.native
  
  val encodingType: js.UndefOr[String] = js.native
  
  val fetchOwner: js.UndefOr[Boolean] = js.native
  
  /**
    * The provider-assigned unique ID for this managed resource.
    */
  val id: String = js.native
  
  /**
    * List of strings representing object keys
    */
  val keys: js.Array[String] = js.native
  
  val maxKeys: js.UndefOr[Double] = js.native
  
  /**
    * List of strings representing object owner IDs (see `fetchOwner` above)
    */
  val owners: js.Array[String] = js.native
  
  val prefix: js.UndefOr[String] = js.native
  
  val startAfter: js.UndefOr[String] = js.native
}
object GetBucketObjectsResult {
  
  @scala.inline
  def apply(
    bucket: String,
    commonPrefixes: js.Array[String],
    id: String,
    keys: js.Array[String],
    owners: js.Array[String]
  ): GetBucketObjectsResult = {
    val __obj = js.Dynamic.literal(bucket = bucket.asInstanceOf[js.Any], commonPrefixes = commonPrefixes.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], keys = keys.asInstanceOf[js.Any], owners = owners.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBucketObjectsResult]
  }
  
  @scala.inline
  implicit class GetBucketObjectsResultOps[Self <: GetBucketObjectsResult] (val x: Self) extends AnyVal {
    
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
    def setBucket(value: String): Self = this.set("bucket", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommonPrefixesVarargs(value: String*): Self = this.set("commonPrefixes", js.Array(value :_*))
    
    @scala.inline
    def setCommonPrefixes(value: js.Array[String]): Self = this.set("commonPrefixes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeysVarargs(value: String*): Self = this.set("keys", js.Array(value :_*))
    
    @scala.inline
    def setKeys(value: js.Array[String]): Self = this.set("keys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnersVarargs(value: String*): Self = this.set("owners", js.Array(value :_*))
    
    @scala.inline
    def setOwners(value: js.Array[String]): Self = this.set("owners", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelimiter(value: String): Self = this.set("delimiter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelimiter: Self = this.set("delimiter", js.undefined)
    
    @scala.inline
    def setEncodingType(value: String): Self = this.set("encodingType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEncodingType: Self = this.set("encodingType", js.undefined)
    
    @scala.inline
    def setFetchOwner(value: Boolean): Self = this.set("fetchOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFetchOwner: Self = this.set("fetchOwner", js.undefined)
    
    @scala.inline
    def setMaxKeys(value: Double): Self = this.set("maxKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxKeys: Self = this.set("maxKeys", js.undefined)
    
    @scala.inline
    def setPrefix(value: String): Self = this.set("prefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefix: Self = this.set("prefix", js.undefined)
    
    @scala.inline
    def setStartAfter(value: String): Self = this.set("startAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartAfter: Self = this.set("startAfter", js.undefined)
  }
}
