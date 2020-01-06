package typings.atPulumiAws

import typings.atPulumiAws.lambdaLambdaMixinsMod.Context
import typings.atPulumiAws.serverlessFunctionMod.Handler
import typings.atPulumiAws.serverlessFunctionMod.HandlerFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_ExcludePackages extends js.Object {
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

object Anon_ExcludePackages {
  @scala.inline
  def apply(
    excludePackages: js.Array[String] = null,
    factoryFunc: () => Handler = null,
    func: (js.Any, /* context */ Context, /* callback */ js.Function2[/* error */ js.UndefOr[js.Any], /* result */ js.UndefOr[js.Any], Unit]) => js.Promise[js.Any] | Unit = null,
    includePackages: js.Array[String] = null,
    includePaths: js.Array[String] = null
  ): Anon_ExcludePackages = {
    val __obj = js.Dynamic.literal()
    if (excludePackages != null) __obj.updateDynamic("excludePackages")(excludePackages.asInstanceOf[js.Any])
    if (factoryFunc != null) __obj.updateDynamic("factoryFunc")(js.Any.fromFunction0(factoryFunc))
    if (func != null) __obj.updateDynamic("func")(js.Any.fromFunction3(func))
    if (includePackages != null) __obj.updateDynamic("includePackages")(includePackages.asInstanceOf[js.Any])
    if (includePaths != null) __obj.updateDynamic("includePaths")(includePaths.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ExcludePackages]
  }
}

