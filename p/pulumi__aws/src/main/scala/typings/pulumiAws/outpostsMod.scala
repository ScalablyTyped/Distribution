package typings.pulumiAws

import typings.pulumiAws.getOutpostInstanceTypeMod.GetOutpostInstanceTypeArgs
import typings.pulumiAws.getOutpostInstanceTypeMod.GetOutpostInstanceTypeResult
import typings.pulumiAws.getOutpostInstanceTypesMod.GetOutpostInstanceTypesArgs
import typings.pulumiAws.getOutpostInstanceTypesMod.GetOutpostInstanceTypesResult
import typings.pulumiAws.getOutpostMod.GetOutpostArgs
import typings.pulumiAws.getOutpostMod.GetOutpostResult
import typings.pulumiAws.getOutpostsMod.GetOutpostsArgs
import typings.pulumiAws.getOutpostsMod.GetOutpostsResult
import typings.pulumiAws.getSiteMod.GetSiteArgs
import typings.pulumiAws.getSiteMod.GetSiteResult
import typings.pulumiAws.getSitesMod.GetSitesResult
import typings.pulumiPulumi.invokeMod.InvokeOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object outpostsMod {
  
  @JSImport("@pulumi/aws/outposts", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def getOutpost(): js.Promise[GetOutpostResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutpost")().asInstanceOf[js.Promise[GetOutpostResult]]
  @scala.inline
  def getOutpost(args: Unit, opts: InvokeOptions): js.Promise[GetOutpostResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutpost")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOutpostResult]]
  @scala.inline
  def getOutpost(args: GetOutpostArgs): js.Promise[GetOutpostResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutpost")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOutpostResult]]
  @scala.inline
  def getOutpost(args: GetOutpostArgs, opts: InvokeOptions): js.Promise[GetOutpostResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutpost")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOutpostResult]]
  
  @scala.inline
  def getOutpostInstanceType(args: GetOutpostInstanceTypeArgs): js.Promise[GetOutpostInstanceTypeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutpostInstanceType")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOutpostInstanceTypeResult]]
  @scala.inline
  def getOutpostInstanceType(args: GetOutpostInstanceTypeArgs, opts: InvokeOptions): js.Promise[GetOutpostInstanceTypeResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutpostInstanceType")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOutpostInstanceTypeResult]]
  
  @scala.inline
  def getOutpostInstanceTypes(args: GetOutpostInstanceTypesArgs): js.Promise[GetOutpostInstanceTypesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutpostInstanceTypes")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOutpostInstanceTypesResult]]
  @scala.inline
  def getOutpostInstanceTypes(args: GetOutpostInstanceTypesArgs, opts: InvokeOptions): js.Promise[GetOutpostInstanceTypesResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutpostInstanceTypes")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOutpostInstanceTypesResult]]
  
  @scala.inline
  def getOutposts(): js.Promise[GetOutpostsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutposts")().asInstanceOf[js.Promise[GetOutpostsResult]]
  @scala.inline
  def getOutposts(args: Unit, opts: InvokeOptions): js.Promise[GetOutpostsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutposts")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOutpostsResult]]
  @scala.inline
  def getOutposts(args: GetOutpostsArgs): js.Promise[GetOutpostsResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getOutposts")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetOutpostsResult]]
  @scala.inline
  def getOutposts(args: GetOutpostsArgs, opts: InvokeOptions): js.Promise[GetOutpostsResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOutposts")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetOutpostsResult]]
  
  @scala.inline
  def getSite(): js.Promise[GetSiteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSite")().asInstanceOf[js.Promise[GetSiteResult]]
  @scala.inline
  def getSite(args: Unit, opts: InvokeOptions): js.Promise[GetSiteResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSite")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSiteResult]]
  @scala.inline
  def getSite(args: GetSiteArgs): js.Promise[GetSiteResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSite")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSiteResult]]
  @scala.inline
  def getSite(args: GetSiteArgs, opts: InvokeOptions): js.Promise[GetSiteResult] = (^.asInstanceOf[js.Dynamic].applyDynamic("getSite")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[GetSiteResult]]
  
  @scala.inline
  def getSites(): js.Promise[GetSitesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSites")().asInstanceOf[js.Promise[GetSitesResult]]
  @scala.inline
  def getSites(opts: InvokeOptions): js.Promise[GetSitesResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("getSites")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[GetSitesResult]]
}
