package typings.pulumiAws.anon

import typings.pulumiAws.lambdaMixinsMod.Context
import typings.pulumiAws.serverlessFunctionMod.Handler
import typings.pulumiAws.serverlessFunctionMod.HandlerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExcludePackages extends js.Object {
  /**
    * The packages relative to the program folder to not include the Lambda upload. This can be
    * used to override the default serialization logic that includes all packages referenced by
    * project.json (except @pulumi packages).  Default is `[]`.
    *
    * @deprecated Use [codePathOptions] instead.
    */
  var excludePackages: js.UndefOr[js.Array[String]] = js.native
  /**
    * @deprecated use [callbackFactory] instead.
    */
  var factoryFunc: js.UndefOr[HandlerFactory] = js.native
  /**
    * @deprecated use [callback] instead.
    */
  var func: js.UndefOr[Handler] = js.native
  /**
    * The packages relative to the program folder to include in the Lambda upload.  The version of
    * the package installed in the program folder and it's dependencies will all be included.
    * Default is `[]`.
    *
    * @deprecated Use [codePathOptions] instead.
    */
  var includePackages: js.UndefOr[js.Array[String]] = js.native
  /**
    * The paths relative to the program folder to include in the Lambda upload.  Default is `[]`.
    *
    * @deprecated Use [codePathOptions] instead.
    */
  var includePaths: js.UndefOr[js.Array[String]] = js.native
}

object ExcludePackages {
  @scala.inline
  def apply(): ExcludePackages = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExcludePackages]
  }
  @scala.inline
  implicit class ExcludePackagesOps[Self <: ExcludePackages] (val x: Self) extends AnyVal {
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
    def setExcludePackagesVarargs(value: String*): Self = this.set("excludePackages", js.Array(value :_*))
    @scala.inline
    def setExcludePackages(value: js.Array[String]): Self = this.set("excludePackages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExcludePackages: Self = this.set("excludePackages", js.undefined)
    @scala.inline
    def setFactoryFunc(value: () => Handler): Self = this.set("factoryFunc", js.Any.fromFunction0(value))
    @scala.inline
    def deleteFactoryFunc: Self = this.set("factoryFunc", js.undefined)
    @scala.inline
    def setFunc(
      value: (js.Any, /* context */ Context, /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], Unit]) => js.Promise[js.Any] | Unit
    ): Self = this.set("func", js.Any.fromFunction3(value))
    @scala.inline
    def deleteFunc: Self = this.set("func", js.undefined)
    @scala.inline
    def setIncludePackagesVarargs(value: String*): Self = this.set("includePackages", js.Array(value :_*))
    @scala.inline
    def setIncludePackages(value: js.Array[String]): Self = this.set("includePackages", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePackages: Self = this.set("includePackages", js.undefined)
    @scala.inline
    def setIncludePathsVarargs(value: String*): Self = this.set("includePaths", js.Array(value :_*))
    @scala.inline
    def setIncludePaths(value: js.Array[String]): Self = this.set("includePaths", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncludePaths: Self = this.set("includePaths", js.undefined)
  }
  
}

