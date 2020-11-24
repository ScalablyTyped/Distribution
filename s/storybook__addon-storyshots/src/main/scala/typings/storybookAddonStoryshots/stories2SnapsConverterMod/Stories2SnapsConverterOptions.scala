package typings.storybookAddonStoryshots.stories2SnapsConverterMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Stories2SnapsConverterOptions extends js.Object {
  
  var snapshotExtension: String = js.native
  
  var snapshotsDirName: String = js.native
  
  var storiesExtensions: js.Array[String] = js.native
}
object Stories2SnapsConverterOptions {
  
  @scala.inline
  def apply(snapshotExtension: String, snapshotsDirName: String, storiesExtensions: js.Array[String]): Stories2SnapsConverterOptions = {
    val __obj = js.Dynamic.literal(snapshotExtension = snapshotExtension.asInstanceOf[js.Any], snapshotsDirName = snapshotsDirName.asInstanceOf[js.Any], storiesExtensions = storiesExtensions.asInstanceOf[js.Any])
    __obj.asInstanceOf[Stories2SnapsConverterOptions]
  }
  
  @scala.inline
  implicit class Stories2SnapsConverterOptionsOps[Self <: Stories2SnapsConverterOptions] (val x: Self) extends AnyVal {
    
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
    def setSnapshotExtension(value: String): Self = this.set("snapshotExtension", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnapshotsDirName(value: String): Self = this.set("snapshotsDirName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStoriesExtensionsVarargs(value: String*): Self = this.set("storiesExtensions", js.Array(value :_*))
    
    @scala.inline
    def setStoriesExtensions(value: js.Array[String]): Self = this.set("storiesExtensions", value.asInstanceOf[js.Any])
  }
}
