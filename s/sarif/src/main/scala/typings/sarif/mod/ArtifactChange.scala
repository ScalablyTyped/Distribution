package typings.sarif.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ArtifactChange extends js.Object {
  
  /**
    * The location of the artifact to change.
    */
  var artifactLocation: ArtifactLocation = js.native
  
  /**
    * Key/value pairs that provide additional information about the change.
    */
  var properties: js.UndefOr[PropertyBag] = js.native
  
  /**
    * An array of replacement objects, each of which represents the replacement of a single region in a single
    * artifact specified by 'artifactLocation'.
    */
  var replacements: js.Array[Replacement] = js.native
}
object ArtifactChange {
  
  @scala.inline
  def apply(artifactLocation: ArtifactLocation, replacements: js.Array[Replacement]): ArtifactChange = {
    val __obj = js.Dynamic.literal(artifactLocation = artifactLocation.asInstanceOf[js.Any], replacements = replacements.asInstanceOf[js.Any])
    __obj.asInstanceOf[ArtifactChange]
  }
  
  @scala.inline
  implicit class ArtifactChangeOps[Self <: ArtifactChange] (val x: Self) extends AnyVal {
    
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
    def setArtifactLocation(value: ArtifactLocation): Self = this.set("artifactLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReplacementsVarargs(value: Replacement*): Self = this.set("replacements", js.Array(value :_*))
    
    @scala.inline
    def setReplacements(value: js.Array[Replacement]): Self = this.set("replacements", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProperties(value: PropertyBag): Self = this.set("properties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProperties: Self = this.set("properties", js.undefined)
  }
}
