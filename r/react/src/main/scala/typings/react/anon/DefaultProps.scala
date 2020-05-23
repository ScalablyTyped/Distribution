package typings.react.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultProps extends js.Object {
  var defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any
  var propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
}

object DefaultProps {
  @scala.inline
  def apply(
    defaultProps: /* import warning: importer.ImportType#apply Failed type conversion: infer D */ js.Any,
    propTypes: /* import warning: importer.ImportType#apply Failed type conversion: infer T */ js.Any
  ): DefaultProps = {
    val __obj = js.Dynamic.literal(defaultProps = defaultProps.asInstanceOf[js.Any], propTypes = propTypes.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefaultProps]
  }
}

