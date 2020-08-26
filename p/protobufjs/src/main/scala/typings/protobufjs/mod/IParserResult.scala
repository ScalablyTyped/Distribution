package typings.protobufjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IParserResult extends js.Object {
  /** Package name, if declared */
  @JSName("package")
  var _package: js.UndefOr[String] = js.native
  /** Imports, if any */
  var imports: js.UndefOr[js.Array[String]] = js.native
  /** Populated root instance */
  var root: Root = js.native
  /** Syntax, if specified (either `"proto2"` or `"proto3"`) */
  var syntax: js.UndefOr[String] = js.native
  /** Weak imports, if any */
  var weakImports: js.UndefOr[js.Array[String]] = js.native
}

object IParserResult {
  @scala.inline
  def apply(root: Root): IParserResult = {
    val __obj = js.Dynamic.literal(root = root.asInstanceOf[js.Any])
    __obj.asInstanceOf[IParserResult]
  }
  @scala.inline
  implicit class IParserResultOps[Self <: IParserResult] (val x: Self) extends AnyVal {
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
    def setRoot(value: Root): Self = this.set("root", value.asInstanceOf[js.Any])
    @scala.inline
    def set_package(value: String): Self = this.set("package", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_package: Self = this.set("package", js.undefined)
    @scala.inline
    def setImportsVarargs(value: String*): Self = this.set("imports", js.Array(value :_*))
    @scala.inline
    def setImports(value: js.Array[String]): Self = this.set("imports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImports: Self = this.set("imports", js.undefined)
    @scala.inline
    def setSyntax(value: String): Self = this.set("syntax", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSyntax: Self = this.set("syntax", js.undefined)
    @scala.inline
    def setWeakImportsVarargs(value: String*): Self = this.set("weakImports", js.Array(value :_*))
    @scala.inline
    def setWeakImports(value: js.Array[String]): Self = this.set("weakImports", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeakImports: Self = this.set("weakImports", js.undefined)
  }
  
}

