
# Scala.js typings for pulumi__aws

Typings are for version 0.18.5

## Library description:
A Pulumi package for creating and managing Amazon Web Services (AWS) cloud resources.

|                    |                 |
| ------------------ | :-------------: |
| Full name          | @pulumi/aws |
| Keywords           | pulumi, aws |
| # releases         | 417 |
| # dependents       | 11 |
| # downloads        | 206934 |
| # stars            | 0 |

## Links
- [Homepage](https://pulumi.io)
- [Bugs](https://github.com/pulumi/pulumi-aws/issues)
- [Repository](https://github.com/pulumi/pulumi-aws)
- [Npm](https://www.npmjs.com/package/%40pulumi%2Faws)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
 * An ARN is an Amazon Resource Name, and uniquely identifies a region globally across all accounts and regions.
 */
/**
 *  A `spread` placement group places instances on distinct hardware.
 */
/**
 * You manage access in AWS by creating policies and attaching them to IAM identities or AWS resources. A policy is an
 * object in AWS that, when associated with an entity or resource, defines their permissions. AWS evaluates these
 * policies when a principal, such as a user, makes a request. Permissions in the policies determine whether the
 * request is allowed or denied.
 *
 * IAM policies define permissions for an action regardless of the method that you use to perform the operation. For
 * example, if a policy allows the `GetUser` action, then a user with that policy can get user information from the
 * AWS Management Console, the AWS CLI, or the AWS API. When you create an IAM user, you can set up the user to
 * allow console or programmatic access. The IAM user can sign in to the console using a user name and password.
 * Or they can use access keys to work with the CLI or API.
 *
 * Most policies are stored in AWS as JSON documents. Identity-based policies, policies used to set boundaries, or AWS
 * STS boundary policies are JSON policy documents that you attach to a user or role. Resource-based policies are JSON
 * policy documents that you attach to a resource. SCPs are JSON policy documents with restricted syntax that you
 * attach to an AWS Organizations organizational unit (OU). ACLs are also attached to a resource, but you must use a
 * different syntax.
 *
 * A JSON policy document includes these elements:
 *
 *     - Optional policywide information at the top of the document
 *     - One or more individual statements
 *
 * Each statement includes information about a single permission. If a policy includes multiple statements, AWS applies
 * a logical OR across the statements when evaluating them. If multiple policies apply to a request, AWS applies a
 * logical OR across all of those policies when evaluating them.
 *
 * For more details about IAM policies, please refer to the AWS documentation online:
 * https://docs.aws.amazon.com/IAM/latest/UserGuide/access_policies.html
 */
/**
 * Runtime is a union type containing all available AWS Lambda runtimes.
 */
/**
 * Tags represents a set of key-value string pairs to which can be applied
 * to an AWS resource.
 */

```

