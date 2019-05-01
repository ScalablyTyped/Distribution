
# Scala.js typings for rfc6902

Typings are for version 2.4.0

## Library description:
Complete implementation of RFC6902 (patch and diff)

|                    |                 |
| ------------------ | :-------------: |
| Full name          | rfc6902 |
| Keywords           | json, patch, diff, rfc6902 |
| # releases         | 11 |
| # dependents       | 18 |
| # downloads        | 3796898 |
| # stars            | 5 |

## Links
- [Homepage](https://github.com/chbrown/rfc6902)
- [Bugs](https://github.com/chbrown/rfc6902/issues)
- [Repository](https://github.com/chbrown/rfc6902)
- [Npm](https://www.npmjs.com/package/rfc6902)
    


## Note
This library has been generated from typescript code from first party type definitions.

Provided with :purple_heart: from [ScalablyTyped](https://github.com/oyvindberg/ScalablyTyped)

## Usage
See [the main readme](../../readme.md) for instructions.

## Comments

These comments are from the typescript definitions and might be useful:
```
/**
`compare()` returns true if `left` and `right` are materially equal
(i.e., would produce equivalent JSON), false otherwise.

> Here, "equal" means that the value at the target location and the
> value conveyed by "value" are of the same JSON type, and that they
> are considered equal by the following rules for that type:
> o  strings: are considered equal if they contain the same number of
>    Unicode characters and their code points are byte-by-byte equal.
> o  numbers: are considered equal if their values are numerically
>    equal.
> o  arrays: are considered equal if they contain the same number of
>    values, and if each value can be considered equal to the value at
>    the corresponding position in the other array, using this list of
>    type-specific rules.
> o  objects: are considered equal if they contain the same number of
>    members, and if each member can be considered equal to a member in
>    the other object, by comparing their keys (as strings) and their
>    values (using this list of type-specific rules).
> o  literals (false, true, and null): are considered equal if they are
>    the same.
*/

```

