package typings.react

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefaultProps extends js.Object {
  var defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
  var propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}

object AnonDefaultProps {
  @scala.inline
  def apply(
    defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any,
    propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ): AnonDefaultProps = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonDefaultProps]
  }
}

