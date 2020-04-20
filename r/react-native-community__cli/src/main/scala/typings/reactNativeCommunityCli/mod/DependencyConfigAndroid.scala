package typings.reactNativeCommunityCli.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DependencyConfigAndroid extends js.Object {
  var folder: String
  var packageImportPath: String
  var packageInstance: String
  var sourceDir: String
}

object DependencyConfigAndroid {
  @scala.inline
  def apply(folder: String, packageImportPath: String, packageInstance: String, sourceDir: String): DependencyConfigAndroid = {
    val __obj = js.Dynamic.literal(folder = folder.asInstanceOf[js.Any], packageImportPath = packageImportPath.asInstanceOf[js.Any], packageInstance = packageInstance.asInstanceOf[js.Any], sourceDir = sourceDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[DependencyConfigAndroid]
  }
}

