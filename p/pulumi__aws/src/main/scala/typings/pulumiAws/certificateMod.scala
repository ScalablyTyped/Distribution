package typings.pulumiAws

import org.scalablytyped.runtime.StringDictionary
import typings.pulumiAws.outputMod.acm.CertificateDomainValidationOption
import typings.pulumiAws.outputMod.acm.CertificateOptions
import typings.pulumiPulumi.mod.CustomResource
import typings.pulumiPulumi.outputMod.Input
import typings.pulumiPulumi.outputMod.Output_
import typings.pulumiPulumi.resourceMod.CustomResourceOptions
import typings.pulumiPulumi.resourceMod.ID
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object certificateMod {
  
  @JSImport("@pulumi/aws/acm/certificate", "Certificate")
  @js.native
  class Certificate protected () extends CustomResource {
    /**
      * Create a Certificate resource with the given unique name, arguments, and options.
      *
      * @param name The _unique_ name of the resource.
      * @param args The arguments to use to populate this resource's properties.
      * @param opts A bag of options that control this resource's behavior.
      */
    def this(name: String) = this()
    def this(name: String, args: CertificateArgs) = this()
    def this(name: String, args: Unit, opts: CustomResourceOptions) = this()
    def this(name: String, args: CertificateArgs, opts: CustomResourceOptions) = this()
    
    /**
      * The ARN of the certificate
      */
    val arn: Output_[String] = js.native
    
    /**
      * ARN of an ACMPCA
      */
    val certificateAuthorityArn: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The certificate's PEM-formatted public key
      */
    val certificateBody: Output_[js.UndefOr[String]] = js.native
    
    /**
      * The certificate's PEM-formatted chain
      * * Creating a private CA issued certificate
      */
    val certificateChain: Output_[js.UndefOr[String]] = js.native
    
    /**
      * A domain name for which the certificate should be issued
      */
    val domainName: Output_[String] = js.native
    
    /**
      * Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g. if SANs are defined. Only set if `DNS`-validation was used.
      */
    val domainValidationOptions: Output_[js.Array[CertificateDomainValidationOption]] = js.native
    
    /**
      * Configuration block used to set certificate options. Detailed below.
      * * Importing an existing certificate
      */
    val options: Output_[js.UndefOr[CertificateOptions]] = js.native
    
    /**
      * The certificate's PEM-formatted private key
      */
    val privateKey: Output_[js.UndefOr[String]] = js.native
    
    /**
      * Status of the certificate.
      */
    val status: Output_[String] = js.native
    
    /**
      * Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`) to trigger recreation.
      */
    val subjectAlternativeNames: Output_[js.Array[String]] = js.native
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: Output_[js.UndefOr[StringDictionary[String]]] = js.native
    
    /**
      * A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
      */
    val validationEmails: Output_[js.Array[String]] = js.native
    
    /**
      * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
      */
    val validationMethod: Output_[String] = js.native
  }
  /* static members */
  object Certificate {
    
    @JSImport("@pulumi/aws/acm/certificate", "Certificate")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Get an existing Certificate resource's state with the given name, ID, and optional extra
      * properties used to qualify the lookup.
      *
      * @param name The _unique_ name of the resulting resource.
      * @param id The _unique_ provider ID of the resource to lookup.
      * @param state Any extra arguments used during the lookup.
      * @param opts Optional settings to control the behavior of the CustomResource.
      */
    @scala.inline
    def get(name: String, id: Input[ID]): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any])).asInstanceOf[Certificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: Unit, opts: CustomResourceOptions): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Certificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: CertificateState): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any])).asInstanceOf[Certificate]
    @scala.inline
    def get(name: String, id: Input[ID], state: CertificateState, opts: CustomResourceOptions): Certificate = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(name.asInstanceOf[js.Any], id.asInstanceOf[js.Any], state.asInstanceOf[js.Any], opts.asInstanceOf[js.Any])).asInstanceOf[Certificate]
    
    /**
      * Returns true if the given object is an instance of Certificate.  This is designed to work even
      * when multiple copies of the Pulumi SDK have been loaded into the same process.
      */
    @scala.inline
    def isInstance(obj: js.Any): /* is @pulumi/aws.@pulumi/aws/acm/certificate.Certificate */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isInstance")(obj.asInstanceOf[js.Any]).asInstanceOf[/* is @pulumi/aws.@pulumi/aws/acm/certificate.Certificate */ Boolean]
  }
  
  trait CertificateArgs extends StObject {
    
    /**
      * ARN of an ACMPCA
      */
    val certificateAuthorityArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The certificate's PEM-formatted public key
      */
    val certificateBody: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The certificate's PEM-formatted chain
      * * Creating a private CA issued certificate
      */
    val certificateChain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A domain name for which the certificate should be issued
      */
    val domainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Configuration block used to set certificate options. Detailed below.
      * * Importing an existing certificate
      */
    val options: js.UndefOr[Input[typings.pulumiAws.inputMod.acm.CertificateOptions]] = js.undefined
    
    /**
      * The certificate's PEM-formatted private key
      */
    val privateKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`) to trigger recreation.
      */
    val subjectAlternativeNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
      */
    val validationMethod: js.UndefOr[Input[String]] = js.undefined
  }
  object CertificateArgs {
    
    @scala.inline
    def apply(): CertificateArgs = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateArgs]
    }
    
    @scala.inline
    implicit class CertificateArgsMutableBuilder[Self <: CertificateArgs] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCertificateAuthorityArn(value: Input[String]): Self = StObject.set(x, "certificateAuthorityArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "certificateAuthorityArn", js.undefined)
      
      @scala.inline
      def setCertificateBody(value: Input[String]): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateBodyUndefined: Self = StObject.set(x, "certificateBody", js.undefined)
      
      @scala.inline
      def setCertificateChain(value: Input[String]): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setOptions(value: Input[typings.pulumiAws.inputMod.acm.CertificateOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: Input[String]): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setSubjectAlternativeNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subjectAlternativeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "subjectAlternativeNames", js.undefined)
      
      @scala.inline
      def setSubjectAlternativeNamesVarargs(value: Input[String]*): Self = StObject.set(x, "subjectAlternativeNames", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setValidationMethod(value: Input[String]): Self = StObject.set(x, "validationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationMethodUndefined: Self = StObject.set(x, "validationMethod", js.undefined)
    }
  }
  
  trait CertificateState extends StObject {
    
    /**
      * The ARN of the certificate
      */
    val arn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * ARN of an ACMPCA
      */
    val certificateAuthorityArn: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The certificate's PEM-formatted public key
      */
    val certificateBody: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * The certificate's PEM-formatted chain
      * * Creating a private CA issued certificate
      */
    val certificateChain: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * A domain name for which the certificate should be issued
      */
    val domainName: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set of domain validation objects which can be used to complete certificate validation. Can have more than one element, e.g. if SANs are defined. Only set if `DNS`-validation was used.
      */
    val domainValidationOptions: js.UndefOr[
        Input[
          js.Array[Input[typings.pulumiAws.inputMod.acm.CertificateDomainValidationOption]]
        ]
      ] = js.undefined
    
    /**
      * Configuration block used to set certificate options. Detailed below.
      * * Importing an existing certificate
      */
    val options: js.UndefOr[Input[typings.pulumiAws.inputMod.acm.CertificateOptions]] = js.undefined
    
    /**
      * The certificate's PEM-formatted private key
      */
    val privateKey: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Status of the certificate.
      */
    val status: js.UndefOr[Input[String]] = js.undefined
    
    /**
      * Set of domains that should be SANs in the issued certificate. To remove all elements of a previously configured list, set this value equal to an empty list (`[]`) to trigger recreation.
      */
    val subjectAlternativeNames: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * A map of tags to assign to the resource.
      */
    val tags: js.UndefOr[Input[StringDictionary[Input[String]]]] = js.undefined
    
    /**
      * A list of addresses that received a validation E-Mail. Only set if `EMAIL`-validation was used.
      */
    val validationEmails: js.UndefOr[Input[js.Array[Input[String]]]] = js.undefined
    
    /**
      * Which method to use for validation. `DNS` or `EMAIL` are valid, `NONE` can be used for certificates that were imported into ACM and then into the provider.
      */
    val validationMethod: js.UndefOr[Input[String]] = js.undefined
  }
  object CertificateState {
    
    @scala.inline
    def apply(): CertificateState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CertificateState]
    }
    
    @scala.inline
    implicit class CertificateStateMutableBuilder[Self <: CertificateState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArn(value: Input[String]): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArnUndefined: Self = StObject.set(x, "arn", js.undefined)
      
      @scala.inline
      def setCertificateAuthorityArn(value: Input[String]): Self = StObject.set(x, "certificateAuthorityArn", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateAuthorityArnUndefined: Self = StObject.set(x, "certificateAuthorityArn", js.undefined)
      
      @scala.inline
      def setCertificateBody(value: Input[String]): Self = StObject.set(x, "certificateBody", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateBodyUndefined: Self = StObject.set(x, "certificateBody", js.undefined)
      
      @scala.inline
      def setCertificateChain(value: Input[String]): Self = StObject.set(x, "certificateChain", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCertificateChainUndefined: Self = StObject.set(x, "certificateChain", js.undefined)
      
      @scala.inline
      def setDomainName(value: Input[String]): Self = StObject.set(x, "domainName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainNameUndefined: Self = StObject.set(x, "domainName", js.undefined)
      
      @scala.inline
      def setDomainValidationOptions(
        value: Input[
              js.Array[Input[typings.pulumiAws.inputMod.acm.CertificateDomainValidationOption]]
            ]
      ): Self = StObject.set(x, "domainValidationOptions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDomainValidationOptionsUndefined: Self = StObject.set(x, "domainValidationOptions", js.undefined)
      
      @scala.inline
      def setDomainValidationOptionsVarargs(value: Input[typings.pulumiAws.inputMod.acm.CertificateDomainValidationOption]*): Self = StObject.set(x, "domainValidationOptions", js.Array(value :_*))
      
      @scala.inline
      def setOptions(value: Input[typings.pulumiAws.inputMod.acm.CertificateOptions]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOptionsUndefined: Self = StObject.set(x, "options", js.undefined)
      
      @scala.inline
      def setPrivateKey(value: Input[String]): Self = StObject.set(x, "privateKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrivateKeyUndefined: Self = StObject.set(x, "privateKey", js.undefined)
      
      @scala.inline
      def setStatus(value: Input[String]): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
      
      @scala.inline
      def setSubjectAlternativeNames(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "subjectAlternativeNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSubjectAlternativeNamesUndefined: Self = StObject.set(x, "subjectAlternativeNames", js.undefined)
      
      @scala.inline
      def setSubjectAlternativeNamesVarargs(value: Input[String]*): Self = StObject.set(x, "subjectAlternativeNames", js.Array(value :_*))
      
      @scala.inline
      def setTags(value: Input[StringDictionary[Input[String]]]): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
      
      @scala.inline
      def setValidationEmails(value: Input[js.Array[Input[String]]]): Self = StObject.set(x, "validationEmails", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationEmailsUndefined: Self = StObject.set(x, "validationEmails", js.undefined)
      
      @scala.inline
      def setValidationEmailsVarargs(value: Input[String]*): Self = StObject.set(x, "validationEmails", js.Array(value :_*))
      
      @scala.inline
      def setValidationMethod(value: Input[String]): Self = StObject.set(x, "validationMethod", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValidationMethodUndefined: Self = StObject.set(x, "validationMethod", js.undefined)
    }
  }
}
