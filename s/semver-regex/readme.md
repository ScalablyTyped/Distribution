
# Scala.js typings for semver-regex

Typings are for version 3.1.0

## Library description:
Regular expression for matching semver versions

|                    |                 |
| ------------------ | :-------------: |
| Full name          | semver-regex |
| Keywords           | semver, version, versions, regex, regexp, match, matching, semantic |
| # releases         | 3 |
| # dependents       | 78 |
| # downloads        | 36318318 |
| # stars            | 2 |

## Links
- [Homepage](https://github.com/sindresorhus/semver-regex#readme)
- [Bugs](https://github.com/sindresorhus/semver-regex/issues)
- [Repository](https://github.com/sindresorhus/semver-regex)
- [Npm](https://www.npmjs.com/package/semver-regex)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
Regular expression for matching [semver](https://github.com/npm/node-semver) versions.

@example
```
import semverRegex = require('semver-regex');

semverRegex().test('v1.0.0');
//=> true

semverRegex().test('1.2.3-alpha.10.beta.0+build.unicorn.rainbow');
//=> true

semverRegex().exec('unicorn 1.0.0 rainbow')[0];
//=> '1.0.0'

'unicorn 1.0.0 and rainbow 2.1.3'.match(semverRegex());
//=> ['1.0.0', '2.1.3']
```
*/

```

