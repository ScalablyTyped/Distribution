package typings.pulumiAws.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object iam {
  
  @scala.inline
  def assumeRolePolicyForPrincipal(principal: typings.pulumiAws.documentsMod.Principal): typings.pulumiAws.documentsMod.PolicyDocument = typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("assumeRolePolicyForPrincipal")(principal.asInstanceOf[js.Any]).asInstanceOf[typings.pulumiAws.documentsMod.PolicyDocument]
  
  @scala.inline
  def getAccountAlias(): js.Promise[typings.pulumiAws.getAccountAliasMod.GetAccountAliasResult] = typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getAccountAlias")().asInstanceOf[js.Promise[typings.pulumiAws.getAccountAliasMod.GetAccountAliasResult]]
  @scala.inline
  def getAccountAlias(opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getAccountAliasMod.GetAccountAliasResult] = typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getAccountAlias")(opts.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getAccountAliasMod.GetAccountAliasResult]]
  
  @scala.inline
  def getGroup(args: typings.pulumiAws.iamGetGroupMod.GetGroupArgs): js.Promise[typings.pulumiAws.iamGetGroupMod.GetGroupResult] = typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getGroup")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.iamGetGroupMod.GetGroupResult]]
  @scala.inline
  def getGroup(
    args: typings.pulumiAws.iamGetGroupMod.GetGroupArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.iamGetGroupMod.GetGroupResult] = (typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getGroup")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.iamGetGroupMod.GetGroupResult]]
  
  @scala.inline
  def getInstanceProfile(args: typings.pulumiAws.getInstanceProfileMod.GetInstanceProfileArgs): js.Promise[typings.pulumiAws.getInstanceProfileMod.GetInstanceProfileResult] = typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceProfile")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceProfileMod.GetInstanceProfileResult]]
  @scala.inline
  def getInstanceProfile(
    args: typings.pulumiAws.getInstanceProfileMod.GetInstanceProfileArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getInstanceProfileMod.GetInstanceProfileResult] = (typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getInstanceProfile")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getInstanceProfileMod.GetInstanceProfileResult]]
  
  @scala.inline
  def getPolicy(args: typings.pulumiAws.getPolicyMod.GetPolicyArgs): js.Promise[typings.pulumiAws.getPolicyMod.GetPolicyResult] = typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getPolicy")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getPolicyMod.GetPolicyResult]]
  @scala.inline
  def getPolicy(
    args: typings.pulumiAws.getPolicyMod.GetPolicyArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getPolicyMod.GetPolicyResult] = (typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getPolicy")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getPolicyMod.GetPolicyResult]]
  
  @scala.inline
  def getPolicyDocument(): js.Promise[typings.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult] = typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getPolicyDocument")().asInstanceOf[js.Promise[typings.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult]]
  @scala.inline
  def getPolicyDocument(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult] = (typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getPolicyDocument")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult]]
  @scala.inline
  def getPolicyDocument(args: typings.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentArgs): js.Promise[typings.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult] = typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getPolicyDocument")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult]]
  @scala.inline
  def getPolicyDocument(
    args: typings.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult] = (typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getPolicyDocument")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getPolicyDocumentMod.GetPolicyDocumentResult]]
  
  @scala.inline
  def getRole(args: typings.pulumiAws.getRoleMod.GetRoleArgs): js.Promise[typings.pulumiAws.getRoleMod.GetRoleResult] = typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getRole")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getRoleMod.GetRoleResult]]
  @scala.inline
  def getRole(args: typings.pulumiAws.getRoleMod.GetRoleArgs, opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getRoleMod.GetRoleResult] = (typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getRole")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getRoleMod.GetRoleResult]]
  
  @scala.inline
  def getServerCertificate(): js.Promise[typings.pulumiAws.getServerCertificateMod.GetServerCertificateResult] = typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getServerCertificate")().asInstanceOf[js.Promise[typings.pulumiAws.getServerCertificateMod.GetServerCertificateResult]]
  @scala.inline
  def getServerCertificate(args: js.UndefOr[scala.Nothing], opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getServerCertificateMod.GetServerCertificateResult] = (typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getServerCertificate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getServerCertificateMod.GetServerCertificateResult]]
  @scala.inline
  def getServerCertificate(args: typings.pulumiAws.getServerCertificateMod.GetServerCertificateArgs): js.Promise[typings.pulumiAws.getServerCertificateMod.GetServerCertificateResult] = typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getServerCertificate")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getServerCertificateMod.GetServerCertificateResult]]
  @scala.inline
  def getServerCertificate(
    args: typings.pulumiAws.getServerCertificateMod.GetServerCertificateArgs,
    opts: typings.pulumiPulumi.invokeMod.InvokeOptions
  ): js.Promise[typings.pulumiAws.getServerCertificateMod.GetServerCertificateResult] = (typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getServerCertificate")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getServerCertificateMod.GetServerCertificateResult]]
  
  @scala.inline
  def getUser(args: typings.pulumiAws.getUserMod.GetUserArgs): js.Promise[typings.pulumiAws.getUserMod.GetUserResult] = typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(args.asInstanceOf[js.Any]).asInstanceOf[js.Promise[typings.pulumiAws.getUserMod.GetUserResult]]
  @scala.inline
  def getUser(args: typings.pulumiAws.getUserMod.GetUserArgs, opts: typings.pulumiPulumi.invokeMod.InvokeOptions): js.Promise[typings.pulumiAws.getUserMod.GetUserResult] = (typings.pulumiAws.mod.iam.^.asInstanceOf[js.Dynamic].applyDynamic("getUser")(args.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[js.Promise[typings.pulumiAws.getUserMod.GetUserResult]]
}
