package typings.react.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PropTypes extends js.Object {
  var propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any = js.native
}

object PropTypes {
  @scala.inline
  def apply(propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): PropTypes = {
    val __obj = js.Dynamic.literal(propTypes = propTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropTypes]
  }
  @scala.inline
  implicit class PropTypesOps[Self <: PropTypes] (val x: Self) extends AnyVal {
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
    def setPropTypes(value: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any): Self = this.set("propTypes", value.asInstanceOf[js.Any])
  }
  
}

